package JAVA_Effective;


import java.lang.annotation.*;
import java.lang.reflect.Field;

@Target(ElementType.FIELD)//애너테이션이 적용 가능한 대상을 FIELD로 정해줍니다.
@Retention(RetentionPolicy.RUNTIME)//코드 실행시 까지 애너테이션이 유지되게 정해줍니다.
@Documented //애너테이션 정보를 javadoc으로 작성된 문서에 포함시킨다.
@interface BackendFramework { //백엔드 프레임워크를 지정해주는 애너테이션을 작성합니다.
    enum Frameworks {SPRING, DJANGO, EXPRESS}

    Frameworks backendFramework() default Frameworks.DJANGO;
}
class KimCoding {
    @BackendFramework(backendFramework = BackendFramework.Frameworks.SPRING)
    private String KimCodingBackend;
}

public class BackEndInfoUtil {
    public static void getBackendInfo(Class<?> InfoExample) {
        String strBackendFramework = "백엔드 프레임워크 : ";

        Field[] fields = InfoExample.getDeclaredFields();

        for(Field field : fields){
            if(field.isAnnotationPresent(BackendFramework.class)){
                BackendFramework backendFramework= field.getAnnotation(BackendFramework.class);
                strBackendFramework = strBackendFramework + backendFramework.backendFramework().toString();
                System.out.println(strBackendFramework);
            }
        }
    }
}
