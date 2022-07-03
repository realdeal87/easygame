// org.demo.buildUtils.groovy
package org.demo

class buildUtils implements Serializable {
  def env
  def steps
  buildUtils(env, steps) {
    this.env = env
    this.steps = steps
  }
  def timedMyMethod(myword) {
    steps.println env.BUILD_NUMBER
    steps.sh "echo 'This is build # ${env.BUILD_NUMBER}'"
    steps.timestamps {
      steps.sh "echo 'this is my word ${myword}'"
    }
  }
}
