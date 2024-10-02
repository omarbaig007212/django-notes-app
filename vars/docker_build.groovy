def call(String imagename, String tag, String dockerhubName){
  sh "docker build -t ${dockerhubName}/${imagename}:${tag} ." 
}
