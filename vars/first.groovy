def call(name)
{
  sh "date"
  sh "ifconfig"
  echo "${name}"
}
