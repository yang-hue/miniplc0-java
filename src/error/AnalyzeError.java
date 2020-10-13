package error;

import util.Pos;

public class AnalyzeError extends CompileError {
    private static final long serialVersionUID = 1L;

    ErrorCode code;
    Pos pos;

    @Override
    public ErrorCode getErr() {
        return code;
    }

    @Override
    public Pos getPos() {
        return pos;
    }

    /**
     * @param errorToken
     * @param code
     * @param pos
     */
    public AnalyzeError(ErrorCode code, Pos pos) {
        this.code = code;
        this.pos = pos;
    }

}
