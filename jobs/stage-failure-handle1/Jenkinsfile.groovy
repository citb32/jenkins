node() {
    stage('STAGE1'){
        sh 'exit 0'
    }
    try {
        stage('STAGE2'){
            sh 'exit 1'
        }
    }catch(e) {
        print "LEts continue"
    }
    stage('STAGE3'){
        sh 'exit 0'
    }
}