@import org.example.hexlet.dto.UsersPage
@param UsersPage page

@template.layout.page(
usercontent = @`
<a href="users/index.jte">User</a>
<p>${page.getUser().getFirstName()} ${page.getUser().getLastName()}</p>
<p>${page.getUser().getEmail()}</p>
)
