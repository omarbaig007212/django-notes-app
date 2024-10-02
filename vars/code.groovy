def code(url,branch){
  echo "Getting the git"
  git url:"${url}",branch:"${branch}"
  echo "DOne"
}
