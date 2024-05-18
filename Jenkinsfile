pipeline{
    agent any
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
            when{
                BRANCH_NAME == 'dev' 
            }
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