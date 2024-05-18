pipeline{
    agent any
    tools{
        maven "${BUILD_TOOL}"
    }
    environment{
        BUILD_TOOL = 'maven-3.9'
    }
    stages{
        stage("build jar"){
            steps{
                script{
                    echo "building the application..."
                    sh "mvn package"
                }
            }
        }
        stage("build image"){
            steps{
                script{
                    echo "building the docker image"

                }
            }
        }
        stage("deploy"){
            }
            steps{
                script{
                    echo "deploying the application..."
                }
            }
        }
}