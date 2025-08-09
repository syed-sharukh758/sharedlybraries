def call(String ProjectName , String ImageTag , String Dockerhubuser ){
sh "docker build -t ${Dockerhubuser}/${ProjectName}:${ImageTag} ."
}
