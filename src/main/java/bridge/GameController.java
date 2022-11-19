package bridge;

import bridge.domain.BridgeNumberGenerator;
import bridge.validator.Validation;
import bridge.view.InputView;
import bridge.view.OutputView;

public class GameController {
    BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();

    public void start() {
        OutputView.printStartGameMessage();
        inputBridgeLength();
        createRandomNumber();
    }

    public String inputBridgeLength() {
        OutputView.printBridgeLengthMessage();
        String inputLength = InputView.readBridgeSize();
        Validation.validateNumber(inputLength);
        Validation.validateNumberThreeToTwenty(inputLength);
        return inputLength;
    }

    public int createRandomNumber() {
        return bridgeNumberGenerator.generate();
    }
}
