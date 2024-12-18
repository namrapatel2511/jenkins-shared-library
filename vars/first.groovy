def call( String name )
{
  sh "date"
  sh "ifconfig"
  echo "Received name is ${name}"
}
