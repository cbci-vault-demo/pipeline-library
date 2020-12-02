// vars/defineProps.groovy
def call(String file) {
  //use the Pipeline Utility Steps plugin readProperties step to read the .nodejs-app custom marker file 
  def props = readProperties file: file
  for ( e in props ) {
    env.setProperty(e.key, e.value)
  }
}
