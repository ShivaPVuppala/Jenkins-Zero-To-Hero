def call() {
  withSonarQubeEnv('sonarserver') {
                    bat '"C:\\Program Files\\apache-maven-3.9.4\\bin\\mvn" clean package sonar:sonar'
                }
}
