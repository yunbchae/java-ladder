package ladder.model;

import java.util.Objects;

public class Member {

    private static final int MEMBER_NAME_LENGTH_LIMIT = 5;

    private final String name;

    private Member(final String name) {
        validate(name);
        this.name = name;
    }

    private void validate(final String name) {
        if (Objects.isNull(name) || "".equals(name.trim()) || name.length() > MEMBER_NAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException("Member name must be exist and the length must be less than 5.");
        }
    }

    public static Member of(final String name) {
        return new Member(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        Member member = (Member) o;
        return Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}