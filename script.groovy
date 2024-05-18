def buildApp(){
    echo 'Building The Application'
    echo "building Version ${NEW_VERSION}"
    echo "Building tool ${BUILD_TOOL}"
}
def testApp(){
    echo 'Testing The Application'
}
def deployApp(){
    echo 'Deploying The Application'
    echo "deployin version ${params.VERSION}"
}
return this