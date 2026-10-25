# My Sites menu for CloudStream

This repo contains both a browser webpage and a menu-only CloudStream plugin project.

## CloudStream plugin

The `SiteMenu` plugin presents the website list from its extension settings menu. Tapping a name opens that site in the phone's browser. It does not scrape pages or resolve video streams.

GitHub Actions builds the `.cs3` plugin and publishes it, along with `plugins.json`, on the `builds` branch. The root `repository.json` points CloudStream to that build list.

To add the repository in CloudStream, use this URL after the repo is public and the build has completed:

`https://raw.githubusercontent.com/Kartik72489/Kartik-/main/repository.json`

If the workflow cannot push to `builds`, check **Settings → Actions → General → Workflow permissions** and allow read and write permissions.

## Browser webpage

`index.html` is a separate responsive page that opens the sites in a browser. It is not installed by CloudStream. GitHub Pages can host it separately from **Settings → Pages** after the repository is public.
