package businessDelegatePattern;

/**
 * @author zhangh
 * @create 2019-07-01
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }

}
