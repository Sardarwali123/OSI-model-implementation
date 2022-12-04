public class Session implements Chain{
    private Chain nextInChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            // Do what the session layer does (controls the dialogues and set the connections)
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
