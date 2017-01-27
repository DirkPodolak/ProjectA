node ('jenkins-slave') {
    // Mark the code checkout 'stage'....
    stage ('Checkout') {

      // Checkout code from repository
      checkout scm
    }

    load "./${values[0]}/Jenkinsfile"

}
