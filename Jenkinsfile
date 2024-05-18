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
                gv.buildApp()
            }
        }
        stage("testing"){
            when {
                expression {
                    params.executeTests
                }
            }
            steps{
                gv.testApp()
            }
        }
        stage("deploying"){
            steps{
                gv.deployApp()
            }
        }
    }
}