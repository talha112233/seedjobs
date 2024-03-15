pipelineJobNames = ['a', 'b',]
pipelineJobNames.each { jobName ->
    pipelineJob(jobName) {
      //triggers {
            //cron('* * * * *')
        //}
      definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/talha112233/seedjobs.git')
                    }
                    branches('*/master') // Optionally specify the branch to checkout
                }
            }
          scriptPath("${jobName}.groovy") // Specify the path to your script
        }
    }
  }
}
