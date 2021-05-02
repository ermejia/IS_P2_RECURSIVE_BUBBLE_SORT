pipeline{
    agent any
    stages{
        stage("Upload Artifact"){
                    environment{
                        MAVEN_HOME = '/usr/share/maven'
                    }
            steps{
                echo "-------Uploading Artifact--------"
            
                rtMavenDeployer (
                    id:'IS_P2_RECURSIVE_BUBBLE_SORT',
                    serverId: 'artifactory',
                    releaseRepo: 'RecursiveSort',
                    snapshotRepo: 'RecursiveSort',
                )
                rtMavenRun(
                    pom: 'pom.xml',
                    goals: 'install',
                    deployerId: 'IS_P2_RECURSIVE_BUBBLE_SORT'
                )

                    echo "-----Deploying Finished-----"
            }
        }
        stage ("Artifactory Information") {
            steps{
                rtPublishBuildInfo (
                    serverId: "artifactory"
                )
            }
        }
    }
}