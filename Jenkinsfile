pipeline{
    agent any
    environment {
      MY_VARIABLE = 'Hello, world!'
    }

    parameters {
        // Define parameters
        string(name: 'USERNAME', defaultValue: '', description: 'Enter your username')
    }

    stages{

        stage('parameter') {

            steps {
                echo "Username: ${params.USERNAME}"
                }

        }

        stage('init'){
            steps{
                echo 'init stage'
            }
            post {
                always {
                    echo "This block always runs after this stage."
                }
            }
        }
            
        stage('Example Stage') {
            steps {
                echo "Value of MY_VARIABLE: ${env.MY_VARIABLE}"
                }
        }

        stage('pipline 2'){
            steps{
                echo 'puch stage'
                error "error will happened"
                }
            post {
                failure{
                build 'jenkins-task1'
                }
            }
            
        }

        stage('deploy'){
            steps{
                echo 'deploy stage'
                }        
        }
    }
}
