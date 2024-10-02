@Library("shared") _
pipeline{
    
    agent { label "agent"}
    
    stages{
        
        stage("Hello"){
            steps{
                script{
                    hello()
                }
            }
        }
        stage("Code"){
            steps{
                script{
                    code("https://github.com/omarbaig007212/django-notes-app.git","main")
                }
            }
        }
        stage("dockerBuild"){
            steps{
                script{
                    docker_build("nodes","latest","bulletstorm1")
                }
            }
        }
        stage("Push to DockerHub"){
            steps{
                script{
                    docker_push("bulletstorm1","nodes","latest")
                }
            }
        }
        stage("Deploy"){
            steps{
                echo "This is deploying the code"
                sh "docker compose down && docker compose up -d"
            }
        }
    }
}
