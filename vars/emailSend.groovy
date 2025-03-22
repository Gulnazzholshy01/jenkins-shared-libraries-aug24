/*

   - create a new library: emailSend
     condition: if build result is Success, send success email
                      else if build result is Failure, send failure email
                      else send 'unknown status' email 

*/


def call(String anything) {
    if (anything == 'SUCCESS'){
            emailext attachLog: true, 
                     body: 'Pipeline ran successfully, check it here: ${JOB_URL}', 
                     subject: 'SUCCESSFUL JOB: job name: ${JOB_NAME}, build number: ${BUILD_NUMBER}', 
                     to: 'zholshygulnaz@gmail.com'
    }
    else if (anything == 'FAILURE'){
            emailext attachLog: true, 
                     body: 'Pipeline failed, check it here: ${JOB_URL}', 
                     subject: 'FAILED JOB: job name: ${JOB_NAME}, build number: ${BUILD_NUMBER}', 
                     to: 'zholshygulnaz@gmail.com'
    }else {
            emailext attachLog: true, 
                     body: 'Pipeline resulted with UNKNOWN STATUS, check it here: ${JOB_URL}', 
                     subject: 'FAILED UNKNOWN JOB: job name: ${JOB_NAME}, build number: ${BUILD_NUMBER}', 
                     to: 'zholshygulnaz@gmail.com'
    }
}

