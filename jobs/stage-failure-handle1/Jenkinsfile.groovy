node() {
    stage('STAGE1'){
        sh 'exit 0'
    }
    stage('STAGE2'){
        sh 'exit 1'
    }
    stage('STAGE3'){
        sh 'exit 0'
    }
}