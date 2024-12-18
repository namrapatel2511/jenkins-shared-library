def call () {
  def content = libraryResource "script1.sh"
  writeFile file : "prog.sh" , text: content 

  sh "bash ./prog.sh"
}
