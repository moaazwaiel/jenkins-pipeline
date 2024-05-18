def gv
pipeline{
    agent any
    parameters{
        choice(name: 'VERSION', choices: ['1.0','1.1','1.2'],description: '')
        booleanParam(name: 'executeTests', defaultValue: true , description: '')
    }
    tools{
        maven "${BUILD_TOOL}"
    }
    environment{
        NEW_VERSION = "${params.VERSION}"
        BUILD_TOOL = 'maven-3.9'
    }
    stages{
        stage("init"){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }
        stage("build"){
            steps{
                script{
                    gv.buildApp()

                }
            }
        }
        stage("testing"){
            when {
                expression {
                    params.executeTests
                }
            }
            steps{
                script{
                    gv.testApp()

                }            
            }
        }
        stage("deploying"){
            input{
                message "select the environment"
                ok 'Done'
                parameters{
                    choice(name: 'ONE', choices: ['dev','prod',description: ''])
                    choice(name: 'TWO', choices: ['dev','prod',description: ''])
                }
            }
            steps{
                script{
                    gv.deployApp()
                    echo "Deploying to ${ONE}"
                    echo "Deploying to ${TWO}"

                }
            }
        }
    }
}