package Cucumber.Page;

public class AllPage {

    public AllPage() {
    }

    private LoginPage loginPage;
    private CommonUsagePage commonUsagePage;
    private ProductsPage productsPage;
    private CartPage cartPage;



    public LoginPage loginPage(){
        if(loginPage == null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public CommonUsagePage commonUsagePage(){
        if (commonUsagePage == null){
            commonUsagePage = new CommonUsagePage();
        }
        return commonUsagePage;
    }

    public ProductsPage productsPage(){
        if (productsPage == null){
            productsPage = new ProductsPage();
        }
        return productsPage;
    }

    public CartPage cartPage(){
        if (cartPage == null){
            cartPage = new CartPage();
        }
        return cartPage;
    }





}
