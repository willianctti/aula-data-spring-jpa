package will.auladataspringjpa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import will.auladataspringjpa.model.User;
import will.auladataspringjpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Willian");
        user.setUsername("Will");
        user.setPassword("dio");

        repository.save(user);

        for(User u: repository.findAll()) {
            System.out.println(u);
        }

    }


}
