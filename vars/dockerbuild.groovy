def call(String ProjectName){
sh "docker build -t ${ProjectName} ."
}
