pipeline{
    agent any
    parameters{
        choice(name: 'VERSION', choices: ['1.0','1.1','1.2'],description: '')
        boolean(name: 'executeTest', defaultVaule: true , description: '')
    }
    tools{
        maven "${BUILD_TOOL}"
    }
    environment{
        NEW_VERSION = "${params.VERSION}"
        BUILD_TOOL = 'maven-3.9'
    }
    stages{
        stage("build"){
            steps{
                echo 'Building The Application'
                echo "building Version ${NEW_VERSION}"
                echo "Building tool ${BUILD_TOOL}"
            }
        }
        stage("testing"){
            when{
                expression{
                    params.executeTest 
                }
            }
            steps{
                echo 'Testing The Application'
            }
        }
        stage("deploying"){
            steps{
                echo 'Deploying The Application'
                echo "deployin version ${params.VERSION}"
            }
        }
    }
}