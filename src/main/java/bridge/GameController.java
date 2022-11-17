package bridge;

import bridge.validator.Validation;
import bridge.view.InputView;
import bridge.view.OutputView;

public class GameController {

    public void start() {
        OutputView.printStartGameMessage();
        inputBridgeLength();
    }

    public String inputBridgeLength() {
        OutputView.printBridgeLengthMessage();
        String inputLength = InputView.readBridgeSize();
        return inputLength;
    }
}
