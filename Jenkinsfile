pipeline{
    agent any
    tools{
        maven "maven-3.9"
    }
    environment{
        NEW_VERSION = '1.3.0'
    }
    stages{
        stage("build"){
            steps{
                echo 'Building The Application'
                echo "building Version ${NEW_VERSION}"
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