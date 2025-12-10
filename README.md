# Prompt Dashboard

A comprehensive prompt management application for organizing and managing AI prompts from various sources.

## Project Structure

```
prompt-dashboard/
├── doc/              # Documentation files
├── scripts/          # Data loading scripts
│   └── prompts/      # Downloaded prompts from cursor.directory
├── backend/          # Node.js + NestJS + TypeScript + MongoDB
└── web/              # TypeScript frontend for entity management
```

## Environment Setup

The project is organized into four main directories:

- **doc**: Contains project documentation
- **scripts**: Scripts for fetching and managing prompt data from external sources
- **backend**: Backend API built with Node.js, NestJS, TypeScript, and MongoDB (or file storage)
- **web**: Frontend application built with TypeScript for managing prompt entities

## Scripts

### Fetch Cursor Prompts

Located in `scripts/`, we have multiple versions of the prompt fetcher:

1. **fetch-cursor-prompts.js** - Node.js version
2. **fetch-cursor-prompts.py** - Python version  
3. **fetch-cursor-prompts.ps1** - PowerShell version (currently used)

#### Usage

To fetch prompts from cursor.directory:

```powershell
cd scripts
powershell -ExecutionPolicy Bypass -File fetch-cursor-prompts.ps1
```

The script will download prompts from the following categories:
- JavaScript
- TypeScript
- Web Scraping
- Testing
- Node.js
- API
- Web Development
- FastAPI
- Best Practices

Prompts are saved in `scripts/prompts/[category]/prompt.md`

## Next Steps

1. Initialize backend with NestJS
2. Set up MongoDB database or file storage
3. Initialize web frontend with TypeScript
4. Create database schema for prompt management
5. Build REST API endpoints
6. Develop frontend UI for prompt CRUD operations

## Development Timeline

- **Phase 1**: Environment setup ✓
- **Phase 2**: Backend development (upcoming)
- **Phase 3**: Frontend development (upcoming)
- **Phase 4**: Integration and testing (upcoming)

## Requirements

- Node.js (for backend)
- TypeScript
- MongoDB or file system storage
- PowerShell (for running scripts on Windows)

## License

TBD
