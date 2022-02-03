def call(Map config=[:]){
  loadLinuxScript(name:"helloworld.sh")
  sh "./helloworld.sh ${config.name} ${config.date}"


}
