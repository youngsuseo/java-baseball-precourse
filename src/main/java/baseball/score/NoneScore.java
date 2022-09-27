package baseball.score;

public class NoneScore implements Score {

    // FIXME 이걸 singleton으로 생성할 수도 있고, enum으로 생성할 수 있는데 방향?
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}