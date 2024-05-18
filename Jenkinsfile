pipeline{
    agent any
    tools{
        maven "${BUILD_TOOL}"
    }
    environment{
        NEW_VERSION = '1.3.0'
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
            steps{
                echo 'Testing The Application'
            }
        }
        stage("deploying"){
            steps{
                echo 'Deploying The Application'
            }
        }
    }
}