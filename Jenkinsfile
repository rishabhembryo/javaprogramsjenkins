pipeline{
    agent any
    stages{
        stage('compile'){
            steps{
               sh 'javac Main.java'
            }
        }
        stage('run'){
            steps{
                sh 'java Main'
            }
        }
    }
    post{

        always{
            echo "Build completed"
        }
        success{
            sh 'echo "Build successful"'
        }
        failure{
            sh 'echo "Build failed"'
        }
    } 
}