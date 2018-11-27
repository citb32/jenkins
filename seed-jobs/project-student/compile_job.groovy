pipelineJob('StudentProj-Compile') {
  displayName('StudentProj-Compile')
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://github.com/citb32/jenkins.git')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/master')
          }
        }
        'doGenerateSubmoduleConfigurations'(false)
        'submoduleCfg'(class:'list')
        'extensions'()
      }
      'scriptPath'('jobs/project-student-jobs/Jenkinsfile-Compile')
      'lightweight'(true)
    }
  }
}
