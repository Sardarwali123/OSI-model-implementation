public class Presntition implements Chain{
    private Chain nextInChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            // Do what the presentation layer does (encryption, translation)
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}