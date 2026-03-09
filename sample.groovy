pipeline{
    agent any
    tools{
        maven "jenkinsmaven"
    }
    stages{
        stage('git checkout'){
            steps{
            git credentialsId: 'cad8d915-89f8-4210-9851-9cdd4eb433b0', url: 'https://github.com/Priyanka-S0897/webapp.git'
            }}
            stage('build'){
            steps{
                sh 'mvn clean install'
            }}
    }
}