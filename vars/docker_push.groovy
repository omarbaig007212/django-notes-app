def call(String dockerHubUser,String projectName, String ImageTag){
  withCredentials([usernamePassword(credentialsId:'dockerhub',passwordVariable:'dockerHubPass',usernameVariable:'dockerHubUser')]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  sh "docker push ${dockerHubUser}/${projectName}:${ImageTag}"
}
