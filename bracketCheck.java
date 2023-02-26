public class bracketCheck {

    private String inpuString;

    public bracketCheck(String inpuString) {
        this.inpuString = inpuString;
    }

    public void Check(){
        int size = inpuString.length();

        StackX Bstack = new StackX(size);

        for(int i = 0; i < size; i ++){

            if(inpuString.charAt(i) == '('){
                Bstack.push('(');
            }
            else if(inpuString.charAt(i) == ')'){
                Bstack.pop();
            }
        }

        if(!Bstack.isEmpty()){
            System.out.println("Invalid");
        }else{
            System.out.println("Valid");
        }
    }

    
    
}
