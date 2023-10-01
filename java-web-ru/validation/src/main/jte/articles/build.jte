<!-- BEGIN -->
@import org.example.hexlet.dto.users.BuildUserPage
@param NewArticlePage page

@if(page.getErrors() != null)
    <ul>
        @for(var validator : page.getErrors().values())
            @for(var error : validator)
                <li>${error.getMessage()}</li>
            @endfor
        @endfor
    </ul>
@endif

<form action="/users" method="post">
    <div>
        <label>
            Название статьи
            <input type="text" name="title" value="${page.getTitle()}" />
        </label>
    </div>
    <div>
        <label>
            Текст статьи
            <input type="textarea" required name="content" value="${page.getContent()}" />
        </label>
    </div>
    <input type="submit" value="Опубликовать" />
</form>
<!-- END -->
