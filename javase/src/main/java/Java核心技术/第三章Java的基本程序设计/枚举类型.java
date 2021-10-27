package Java核心技术.第三章Java的基本程序设计;

public enum 枚举类型 {
    SMALL(1,"小号"),
    MEDIUM(2,"中号"),;

    private int code ;
    private String message ;
    枚举类型(int code , String message){
        this.code = code ;
        this.message = message ;
    }

    public static int getCode(String define){
        // 返回枚举类型的code,根据Message
        return 枚举类型.valueOf(define).code ;
    }

    public static String getMessage(String define){
        return 枚举类型.valueOf(define).message ;
    }
}
