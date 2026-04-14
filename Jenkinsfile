pipeline{
    agent any
    tools{
        jdk 'jdk21'
        gradle 'gradle'
    }
    environment{
        
        VERSION_NAME="1.0"
    }
    stages{
        stage('compile'){
            steps{
               sh 'javac Main.java'
               sh 'echo "Version name is ${VERSION_NAME}"'
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