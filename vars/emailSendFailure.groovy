def call() {
    emailext attachLog: true, 
             body: 'Pipeline failed, check it here: ${JOB_URL}', 
             subject: 'FAILED JOB: job name: ${JOB_NAME}, build number: ${BUILD_NUMBER}', 
             to: 'zholshygulnaz@gmail.com'
}