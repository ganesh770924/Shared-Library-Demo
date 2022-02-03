def call(Map config=[:]){
  def scriptcontents =libraryResource "src/hexaware/scripts/${config.name}" 
  writeFile file: "${config.name}",text: scriptcontents
  sh "chmod a+x ./${config.name}"
}
