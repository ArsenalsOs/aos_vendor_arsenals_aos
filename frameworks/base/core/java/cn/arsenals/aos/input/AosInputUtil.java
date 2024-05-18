package cn.arsenals.aos.input;

import android.hardware.input.InputManager;
import android.view.InputEvent;

public final class AosInputUtil {
    public static final int INJECT_INPUT_EVENT_MODE_ASYNC = InputManager.INJECT_INPUT_EVENT_MODE_ASYNC;
    public static final int INJECT_INPUT_EVENT_MODE_WAIT_FOR_RESULT = InputManager.INJECT_INPUT_EVENT_MODE_WAIT_FOR_RESULT;
    public static final int INJECT_INPUT_EVENT_MODE_WAIT_FOR_FINISH = InputManager.INJECT_INPUT_EVENT_MODE_WAIT_FOR_FINISH;

    public static boolean injectInputEvent(InputEvent event, int mode) {
        return InputManager.getInstance().injectInputEvent(event, mode);
    }
}
