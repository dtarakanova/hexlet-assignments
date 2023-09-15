<!-- BEGIN -->
@import org.example.hexlet.dto.UsersPage
@param UsersPage page

@template.layout.page(
content = @`
    <a href="users/show.jte">Users</a>
    @for(var user : page.getUser())
        <p>${page.getUser().getFirstName()} ${page.getUser().getLastName()}</p>
        <p>${page.getUser().getEmail()}</p>
    @endfor
)
<!-- END -->
