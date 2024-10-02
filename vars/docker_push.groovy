def call(String projectName, String ImageTag){
  withCredentials([usernamePassword(credentialsId:'dockerhub',passwordCredentials:'dockerHubPass',usernameCredentials:'dockerHubUser')]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  sh "docker push ${dockerHubUser}/${projectName}:${ImageTag}"
}
