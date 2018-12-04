node() {
    stage('STAGE1'){
        sh 'exit 0'
    }
    try {
        stage('STAGE2'){
            sh 'exit 0'
        }
    }catch(e) {
        build_ok = false
    }
    if(build_ok) {
        stage('STAGE3'){
            sh 'exit 0'
        }
    } else {
        stage('STAGE4'){
            sh 'exit 0'
        }
    }
}