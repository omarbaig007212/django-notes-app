def code(String url,String branch){
  echo "Getting the git"
  git url:"${url}",branch:"${branch}"
  echo "DOne"
}
