@import exercise.dto.users.UserPage
@param UserPage page

@template.layout.page(
content = @`
            <h2>${page.getUser().getFirstName()}</h2>
            <p>${page.getUser().getEmail()}</p>`
)